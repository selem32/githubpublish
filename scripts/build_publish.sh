#!/bin/sh

if [[ "$TRAVIS_BRANCH" == "master" ]]; then
  ./gradlew publish -PdisablePreDex --stacktrace
fi

