#!/bin/sh

echo $TRAVIS_BRANCH

if [[ "$TRAVIS_BRANCH" = "master" ]]; then
    echo "We're on the master branch."
    ./gradlew clean build publish -PdisablePreDex --stacktrace
else
    ./gradlew clean build -PdisablePreDex --stacktrace
    echo "We're on the master branch."
fi

