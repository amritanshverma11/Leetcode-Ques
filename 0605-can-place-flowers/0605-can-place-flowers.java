class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        for(int i=0;i<f.length;i++ )
        {
            if(n==0)break;
            if(i==0)
            {

                if(f.length>1){
                if(f[0]==0&&f[1]==0){
                n--;
                f[0]=1;}}
                else if (f.length==1&&f[0]==0)
                {n--;
                f[0]=1;}
            }
            else if(i==(f.length-1)&&f[f.length-1]==0&&f[f.length-2]==0)
            {
                n--;
                f[f.length-1]=1;
            }
            else if(i>0&&i<f.length-1&&f[i-1]==0&&f[i]==0&&f[i+1]==0)
            { 
                n--;
                f[i]=1;
            }
            
           
        }
        return (n==0);
    }
}