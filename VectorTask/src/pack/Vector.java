package pack;

public class Vector {

    public Vector(int x, int y, int z){
        this.x1 = x;
        this.y1 = y;
        this.z1 = z;

        System.out.println("new vector created with parameters");
        System.out.println("x: " + this.x1);
        System.out.println("y: " + this.y1);
        System.out.println("z: " + this.z1);
        System.out.println();
    }

    int x1;
    int x2;
    int y1;
    int y2;
    int z1;
    int z2;

    public void showVectorLength () {
        double vectorLength = Math.sqrt(this.x1 * this.x1 + this.y1 * this.y1 + this.z1 * this.z1);
        System.out.println("vector length is: " + vectorLength);
        System.out.println();
    }

}
