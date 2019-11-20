#!/bin/sh

echo $TRAVIS_BRANCH
echo $TRAVIS_PULL_REQUEST

if [ $TRAVIS_BRANCH = "master" -a $TRAVIS_PULL_REQUEST = "false" ]; then
    ./gradlew clean build publish -PdisablePreDex --stacktrace
    echo "We're on the master branch."
else
    echo "We're not on the master branch."
    ./gradlew clean build -PdisablePreDex --stacktrace
fi

