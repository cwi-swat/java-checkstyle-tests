#! /bin/sh

java \
  -Dcheckstyle.importcontrol.file="import-control.xml" \
  -Dcheckstyle.header.file="./header.txt" \
  -Dcheckstyle.suppressions.file="suppressions.xml" \
  -Dcheckstyle.cache.file=./.checkStyleCache \
  -jar checkstyle-5.7-all.jar \
  -f xml \
  -c ./checkstyle_checks.xml \
  -r ../src \
  > output.xml
  
