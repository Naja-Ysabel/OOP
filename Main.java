/**
 * CICS Schedule System - Main Entry Point
 *
 * FIX: Removed all business logic from Main.java
 * WHY: Main should only instantiate objects and start the application
 *      All logic moved to SystemController class (Better OOP design)
 *
 * SDG 9 Alignment: Industry, Innovation, and Infrastructure
 * This system promotes SDG 9 by building reliable digital infrastructure
 * for schedule management and fostering innovation through OOP architecture.
 */
public class Main {
    public static void main(String[] args) {
        // FIX: Main.java now contains ONLY instantiation
        // WHY: Follows Single Responsibility Principle - Main just starts the app
        //      All logic delegated to SystemController

        SystemController controller = new SystemController();
        controller.run();
    }
}
