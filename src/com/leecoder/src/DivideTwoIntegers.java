package com.leecoder.src;

public class DivideTwoIntegers {

	/**
	 * 不使用乘除和取余运算，计算除法
	 * @param dividend
	 * @param divisor
	 * @return
	 */
    public static int divide(int dividend, int divisor) {
    	
    	int flag = (dividend>=0?1:-1)*(divisor>=0?1:-1);	//判断输出结果的符号
    	long dividendtemp = Math.abs((long)dividend);		//转换为long避免溢出
    	long divisortemp = Math.abs((long)divisor);
    	
    	int cnt = 0;
    	int rs1 = 1;
    	long sub = 0;
    	while (dividendtemp>=(divisortemp<<cnt)) {
    		cnt++;
			rs1<<=1;
		}
    	if (cnt>=1) {
			cnt--;
			rs1>>=1;
		}
    	sub = dividendtemp-(divisortemp<<cnt);
    	while(sub>=divisortemp){
    		cnt++;
    		rs1+=1;
    		sub = sub-divisortemp;
    	}
    	if (flag>0&&rs1>Integer.MAX_VALUE) {
			rs1 = Integer.MAX_VALUE;
		}
    	if (flag<0&&rs1<Integer.MIN_VALUE) {
			rs1 = Integer.MIN_VALUE;
		}    	
		if (flag>0) {
			return rs1;
			
		}else{
			return -rs1;
		}
    	

    }
}
