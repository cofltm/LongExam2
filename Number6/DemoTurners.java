public class DemoTurners {
    public static void main(String[] args) {
        Turner[] turners = new Turner[3];
        turners[0] = new Leaf();
        turners[1] = new Page();
        turners[2] = new Pancake();

        for (Turner turner : turners) {
            turner.turn();
        }
    }
}
