public class TestCase {
	
    private final String testCaseID;
    private String testSteps;
    private String expectedOutcome;

    // Parameterized Constructor to initialize all attributes
    public TestCase(String testCaseID, String testSteps, String expectedOutcome) {
        this.testCaseID = testCaseID;
        this.testSteps = testSteps;
        this.expectedOutcome = expectedOutcome;
    }

    // Getter for testCaseID
    public String getTestCaseID() {
        return testCaseID;
    }

    // Getter for testSteps
    public String getTestSteps() {
        return testSteps;
    }

    // Setter for testSteps
    public void setTestSteps(String testSteps) {
        this.testSteps = testSteps;
    }

    // Getter for expectedOutcome
    public String getExpectedOutcome() {
        return expectedOutcome;
    }

    // Setter for expectedOutcome
    public void setExpectedOutcome(String expectedOutcome) {
        this.expectedOutcome = expectedOutcome;
    }

    // Method to display test case details
    public void displayDetails() {
        System.out.println("TestCase ID: " + testCaseID);
        System.out.println("Test Steps: " + testSteps);
        System.out.println("Expected Outcome: " + expectedOutcome);
    }

    public static void main(String[] args) {
    	
        // Instantiate two TestCase objects
        TestCase testCase1 = new TestCase("TC-01", "Step 1: Open maps application\nStep 2: Click on Allow Location", "Expected: The Map should shown your current location");
        TestCase testCase2 = new TestCase("TC-02", "Step 1: Click on Power Off button\nStep 2: Confirm the power Off", "Expected: The device should power off");

        // Modify some attributes using setters
        testCase1.setTestSteps("Step 1: Open maps application\nStep 2: Click on Allow Once");
        testCase1.setExpectedOutcome("Expected: The Map should shown your current location");

        // Print out details
        testCase1.displayDetails();
        System.out.println();
        testCase2.displayDetails();
    }
}
