FROM java:8
COPY sum_java.java .

RUN javac sum_java.java
CMD ("java", "sum_java")