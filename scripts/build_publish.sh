#!/bin/sh

echo $TRAVIS_BRANCH

if [[ "$TRAVIS_BRANCH" = "master" ]]; then
  echo "We're on the master branch."
  ./gradlew publish
else
  echo "We're on the master branch."
fi

