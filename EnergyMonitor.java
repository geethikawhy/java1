class EnergyMonitor {
public static double TotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter morning energy generation: ");
        double morning = sc.nextDouble();

        System.out.print("Enter evening energy generation: ");
        double evening = sc.nextDouble();
        double totalEnergy = EnergyMonitor.TotalEnergy(morning, evening);
        System.out.println("Total energy generated: " + totalEnergy);

        sc.close();
    }
