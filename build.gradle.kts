plugins {
    id ("java-library")
    id("maven-publish")
}

group = "com.xpi"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    repositories {
        // The target repository
        maven {
            // Choose whatever name you want
            name = "GitHubPackages"
            // The url of the repository, where the artifacts will be published
            url = uri("https://maven.pkg.github.com/XPI-HUB/xpi-java-sdk")
            credentials {
                // The credentials (described in the next section)
                username = project.findProperty("gpr.user").toString()
                password = project.findProperty("gpr.key").toString()
            }
        }
    }
    publications {
        register<MavenPublication>("mavenJava") {
            from(components["java"])
            pom {
                name.set("Project Name")
            }
        }
    }
}

//val sourcesJar by tasks.registering(Jar::class) {
//    archiveClassifier.set("sources")
//    from(sourceSets.main.get().allSource)
//}
