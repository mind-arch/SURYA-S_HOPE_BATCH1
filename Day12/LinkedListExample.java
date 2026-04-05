import java.util.LinkedList;

class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> runningrace = new LinkedList<>();
        runningrace.add("a");
        runningrace.add("b");
        runningrace.add("c");
        System.out.println(runningrace);
        runningrace.remove("b");
        System.out.println("Player B is eliminated and no longer in the race: "+runningrace);
        System.out.println("Race is over, winner is: "+runningrace.get(0));
        System.out.println("Runner Up is: "+runningrace.get(1));
        runningrace.clear();
        System.out.println("Race is Over: "+runningrace);
    }
}
