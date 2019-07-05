find . -name "*.java" > sources.txt
javac -sourcepath . @sources.txt
java deadman/Simulator scenario.txt