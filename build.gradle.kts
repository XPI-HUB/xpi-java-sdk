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

// Configures the publishing
publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/xpi-hub/xpi-java-sdk/")
            credentials {
                username = "avivijay19"
                password = "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"
            }
        }
    }
    publications {
        register("gpr", MavenPublication::class) {
            from(components["java"]) //This part fails with a Unresolved reference. None of the following
            //candidates is applicable because of receiver type mismatch:
        }
    }
}
