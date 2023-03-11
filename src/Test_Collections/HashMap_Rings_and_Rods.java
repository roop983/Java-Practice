package Test_Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HashMap_Rings_and_Rods {

	public static void main(String[] args) {
		
		Map<Integer, String> mp = new HashMap<>();
		
		int ans=0;
        for(int i=0;i<rings.size()-1;i++)
        {
            mp[rings[i+1]-'0'] += rings[i];
        }
        for(int i=0;i<=9;i++)
        {
            int R=0,B=0,G=0;
            string ch=mp[i];
            for(int i=0;i<ch.size();i++)
            {
                 if(ch[i]=='R')
                 {
                     R=1;
                 }
                 if(ch[i]=='G')
                 {
                     G=1;
                 }
                 if(ch[i]=='B')
                 {
                     B=1;
                 }
            }
            if(R==1 && G==1 && B==1)
            {
                ans++;
            }

        }return ans;
		
		
	}

}
