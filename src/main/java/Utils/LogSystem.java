package Utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class LogSystem {
	
	private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS");
	
	/*
	 * d - ���
	 * M - �����
	 * y - ���
	 * H - ����
	 * m - ������ 
	 * s - ������� 
	 * S - ��
	 */
		
	public static void log(Object who, Object what) {
		
		String log =  dateFormat.format(new Date()) + " ";
		log +=	String.valueOf(who) + " > " + String.valueOf(what);
		
		
		
		System.out.println(log);
	}

}
