plugins {
    id ("java-library")
    id("maven-publish")
}

group = "com.xpi"
version = "0.0.2"

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
                username = "aditinikam"
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
