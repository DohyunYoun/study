package algorithm.string;

import algorithm.binarySerach.Boj2869;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by DohyunYoun on 2020-07-14
 * SITE :
 * <p>
 * Used Algorithm :
 * Used Data Structure :
 * Time Complexity :
 * Point :
 */
public class Boj5052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < n ; i ++){
            int nums = Integer.parseInt(br.readLine());
            String[] phone = new String[nums];
            for(int j = 0 ; j < nums ; j ++){
                phone[j] = br.readLine();
            }
            System.out.println(find(phone));
        }
    }
    static String find( String[] arr){
        Arrays.sort(arr);
        for(int i = 0 ; i < arr.length-1 ; i ++){
            if(arr[i].startsWith(arr[i+1]) || arr[i+1].startsWith(arr[i])){
                return "NO";
            }
        }
        return "YES";
    }
}
