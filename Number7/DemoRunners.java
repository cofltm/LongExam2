public class DemoRunners {
    public static void main(String[] args) {
        Runner[] runners = new Runner[3];
        runners[0] = new Machine();
        runners[1] = new Athlete();
        runners[2] = new PoliticalCandidate();

        for (Runner runner : runners) {
            runner.run();
        }
    }
}
