public class GCD {


    public Long greatestCommonDivisor(Long num1, Long num2) {
        //If p > q, the gcd of p and q is the same as the gcd of q and p % q.
        //        if (q == 0) return p;
        //        else return gcd(q, p % q);
        if (num2 == 0) {
            return num1;
        } else {
            return greatestCommonDivisor(num2, num1 % num2);
        }
    }
        public Long greatestCommonDivisor2(Long num1, Long num2){
            //  while (q != 0) {
            //            int temp = q;
            //            q = p % q;
            //            p = temp;
            //        }
            //        return p;
            while (num2 != 0){
                Long temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            return num1;
        }
    }



