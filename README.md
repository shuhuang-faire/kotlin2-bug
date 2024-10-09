# kotlin2-bug

When we upgrade Kotlin from 1.9 to 2.0.10 we noticed a lot of unresolved references, mostly under testFixtures. This project is to illustrate what happens. To reproduce it, first run
```
./gradlew compileTestKotlin
./gradlew compileTestFixturesKotlin
```
Both should work. Then, change the kotlin version in [build.gradle.kt](https://github.com/shuhuang-faire/kotlin2-bug/blob/main/build.gradle.kts) to "2.0.10" and run the above two tasks. They should both fail.

Basically we noticed two things:
1. implementation dependency is added to testFixturesImplementation. We believe this is a bug because testFixtures should not see main's implementation dependencies. To fix this, either use api dependency or add testFixturesImplementation dependencies explicitly.
2. similarly, testFixturesImplementation dependencies are added to testImplementation. This should also be a bug. To fix, use testFixturesApi or add testImplementation dependency explicitly.
