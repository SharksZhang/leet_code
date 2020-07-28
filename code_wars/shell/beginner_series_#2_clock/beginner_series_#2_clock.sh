#!/usr/bin/env bash
readonly h=$1
readonly m=$2
readonly s=$3

echo $[(h * 60 * 60 + m * 60 + s) * 1000]