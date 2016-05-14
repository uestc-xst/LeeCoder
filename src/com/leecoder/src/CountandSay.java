package com.leecoder.src;

import java.util.ArrayList;
import java.util.List;

public class CountandSay {

	
	/**
	 * n=1ʱ����ַ���1��n=2ʱ�����ϴ��ַ����е���ֵ��������Ϊ�ϴ��ַ�����1��1���������11��
	 * n=3ʱ�������ϴ��ַ���11����2��1���������21��n=4ʱ�������ϴ��ַ�����21����1��2��1��1���������1211��
	 * �������ƣ�д��countAndSay(n)���������ַ���
	 * @param n
	 * @return
	 */
    public static String countAndSay(int n) {
    	
    	if (n==1) {
			return "1";
		}
    	String last = countAndSay(n-1);
    	List<Character> list = new ArrayList<>();
    	for(int i=0;i<last.length();i++){
    		list.add(last.charAt(i));
    	}
    	char temp = ' ';
    	char lastchr = ' ';
    	int cnt = 0;
    	StringBuilder result = new StringBuilder();
    	for(int i=0;i<list.size();i++){
    		if (i==0) {
				cnt++;
				lastchr = list.get(0);
			}else {
				if (lastchr==list.get(i)) {
					cnt++;
				}else {
					
					result.append(cnt); 
					result.append(lastchr);
					cnt = 1;
					lastchr = list.get(i);
				}
			}
    	}
		result.append(cnt); 
		result.append(lastchr);
		
        return result.toString();
    }
}
