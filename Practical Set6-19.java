class VotingApp {
    static void checkEligibility(int age) {
        if(age < 18)
            throw new IllegalArgumentException("Age must be 18+");
        else
            System.out.println("Eligible");
    }

    public static void main(String[] args) {
        try {
            checkEligibility(16);
        } catch(Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Validation completed");
        }
    }
}