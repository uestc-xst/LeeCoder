package com.leecoder.src;

public class DivideTwoIntegers {

	/**
	 * ��ʹ�ó˳���ȡ�����㣬�������
	 * @param dividend
	 * @param divisor
	 * @return
	 */
    public static int divide(int dividend, int divisor) {
    	
    	int flag = (dividend>=0?1:-1)*(divisor>=0?1:-1);	//�ж��������ķ���
    	long dividendtemp = Math.abs((long)dividend);		//ת��Ϊlong�������
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
