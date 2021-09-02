default: run

run:
	./gradlew run

clean:
	./gradlew clean

test:
	./gradlew clean test

tests: test