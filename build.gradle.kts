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
            url = uri("https://maven.pkg.github.com/xpi-hub/xpi-java-sdk")
            credentials {
                // The credentials (described in the next section)
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GH_TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("mavenJava") {
            from(components["java"])
        }
    }
}
