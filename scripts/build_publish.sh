#!/bin/sh

if [[ "$TRAVIS_BRANCH" != "master" ]]; then
  echo "We're not on the master branch."
  # analyze current branch and react accordingly
  else
  echo "We're on the master branch."
  ./gradlew clean build publish -PdisablePreDex --stacktrace
fi

