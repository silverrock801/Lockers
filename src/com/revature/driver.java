package com.revature;

import java.util.ArrayList;
import java.util.List;

import com.revature.models.locker;

public class driver {

	public static void main(String[] args) {
		
		List<locker> lock = new ArrayList<locker>();
		
		for (int i = 0; i < 100; i++) {
			
			locker l = new locker();
			
			l.setNum(i + 1);
			l.setOpen(true);
			
			lock.add(l);
			
		}
		
		for (int a = 2; a <= 100; a++) {
			
			for (int i = 0; i <= 99; i++) {
				
				if (lock.get(i).getNum() % a == 0) {
					locker b = lock.get(i);
					
					if (b.isOpen() == true) {
						b.setOpen(false);
					}
					
					else {
						b.setOpen(true);
					}
				
					lock.set(i, b);
					
				}
			}
		}
		
		int ans = 0;
		
		for (int i = 0; i < 100; i++) {
			locker check = lock.get(i);
			
			if (check.isOpen() == true) {
				ans ++;
			}
		}
		
		
		System.out.println("The number of open lockers is: " + ans);

	}

}
