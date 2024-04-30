plugins {
    id("java")
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

publishing.publications {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/XPI-HUB/xpi-java-sdk")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GH_TOKEN")
            }
        }
    }
}
