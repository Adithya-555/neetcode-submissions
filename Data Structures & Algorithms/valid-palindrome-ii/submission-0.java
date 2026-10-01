class Solution { 
    boolean pal(String str) { 
            int left = 0; 
            int right = str.length() - 1; 
            
            while (left < right) { 
                if (str.charAt(left) != str.charAt(right)) { 
                    return false; 
                } 
                left++; 
                right--; 
            } 
            return true; 
        } 
    public boolean validPalindrome(String s) { 

        if (pal(s)) { 
            return true; 
        } 
        else { 
            for (int i = 0; i < s.length(); i++) { 
                StringBuilder sb = new StringBuilder(s); 
                sb.deleteCharAt(i);
                
                if (pal(sb.toString())) { 
                    return true; 
                } 
            } 
        } 
        
        return false; 
    } 
}