public class array {
    int [] arr= {10,20,30,40,50};
    int [][] arr2D= {
        {1,2,3},
        {4,5,6},
        {7,8,9}
    };
    int [][][] arr3D= {
        {
            {1,2},
            {3,4}
        },
        {
            {5,6},
            {7,8}
        }
    };

    //Method to display array elements
    void display(){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    void display2D(){
        for(int i=0;i<arr2D.length;i++){
            for(int j=0;j<arr2D[i].length;j++){
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }
    }
    void display3D(){
        for(int i=0;i<arr3D.length;i++){
            for(int j=0;j<arr3D[i].length;j++){
                for(int k=0;k<arr3D[i][j].length;k++){
                    System.out.print(arr3D[i][j][k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        array obj=new array();
        obj.display();
        obj.display2D();
        obj.display3D();
    }
}
