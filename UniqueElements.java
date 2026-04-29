
package com.mycompany.uniqueelements;

public class UniqueElements {

    public static void main(String[] args) {
   

        
      int[] arr = {1, 2, 2, 3, 4, 4, 5};
int n = arr.length;

int[] temp = new int[n];
int j = 0; 

for (int i = 0; i < n; i++) {
    boolean isDuplicate = false;
    

    for (int k = 0; k < j; k++) {
        if (arr[i] == temp[k]) {
            isDuplicate = true;
            break;
        }
    }
    

    if (!isDuplicate) {
        temp[j] = arr[i];
        j++;
    }
}

int[] uniqueArr = new int[j];
for (int i = 0; i < j; i++) {
    uniqueArr[i] = temp[i];
}


for (int x : uniqueArr) {
    System.out.print(x + " ");
}
  
        
    }
}
