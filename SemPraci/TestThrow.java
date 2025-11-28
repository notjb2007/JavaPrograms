class TestThrow {
    void checkMarks(int marks) {
        if (marks < 35) {
            throw new ArithmeticException("Fail — marks too low");
        }
        System.out.println("Pass");
    }

    public static void main(String[] args) {
        TestThrow obj = new TestThrow();
        obj.checkMarks(20); // this will cause throw
    }
}
