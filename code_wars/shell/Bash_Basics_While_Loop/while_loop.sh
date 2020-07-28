#!/bin/bash

countToTwenty() {
  # Your Code Here...
  i=0
  while((i<=20))
  do
      echo "Count: $i"
      i=$[$i+1]
  done
}

countToTwenty