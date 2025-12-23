public class VolumeOfEarthKmMiles {
    public static void main(String[] args) {
        double radius = 6378;
        
        double volumeOfEarthKm = (4.0/3.0)*Math.PI*Math.pow(radius,3);
        double miles = 0.621371 * radius;
        double volumeOfEarthMiles = (4.0/3.0)*Math.PI*Math.pow(miles,3);

        System.out.println("The volume of earth cube kilometer " + volumeOfEarthKm);
        System.out.println("The volume of earth cube miles "+ volumeOfEarthMiles);

    }
}
