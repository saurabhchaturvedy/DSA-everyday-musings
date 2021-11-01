import java.util.Arrays;

public class MinimumPlatforms {


    private static int minimumNoOfPlatforms(int[]arr,int[]dep)
    {

        if(arr==null || dep==null || arr.length!=dep.length)
        {

            return 0;
        }
        Arrays.sort(dep);
        int n=arr.length;
        int platformsNeeded=0;
        int minimumPlatforms=0;
        int i=0;
        int j=0;

        while (i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                platformsNeeded++;
                i++;
            }
            else
            {
                platformsNeeded--;
                j++;
            }

            if(platformsNeeded>minimumPlatforms)
            {
                minimumPlatforms=platformsNeeded;
            }
        }
        return minimumPlatforms;
    }


    public static void main(String[] args) {

        int[]arr = {900,940,950,1100,1500,1800};
        int[]dep = {910,1200,1120,1130,1900,2000};

        System.out.println(minimumNoOfPlatforms(arr,dep));
    }
}
