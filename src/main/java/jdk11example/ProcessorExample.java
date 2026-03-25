package jdk11example;

public class ProcessorExample {

	public static void main(String[] args) {
        ProcessHandle currentProcess = ProcessHandle.current();
        System.out.println("PID = " + currentProcess.pid());
    }
}
