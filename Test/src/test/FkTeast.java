package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FkTeast {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long t1 = System.currentTimeMillis();
	//	System.out.println(t1);
		String s1 = "";
		String s2 = "";
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\Users\\prabhakar\\workspace\\Test\\Review-Similarity_testcases\\input000.txt"));
			s1 = br.readLine();
			s2 = br.readLine();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		s1 = s1.toLowerCase().replace(".", " ").replace(",", " ");
		s2 = s2.toLowerCase().replace(".", " ").replace(",", " ");
		String sarr1[] = s1.split(" ");
		/*
		 * for(int i=0;i<sarr.length;i++){ System.out.println(sarr[i]); }
		 */
		String sarr2[] = s2.split(" ");
		HashMap<String, Integer> smap1 = new HashMap<String, Integer>();
		ArrayList<String> l1 = new ArrayList<>();
		HashMap<String, Integer> smap2 = new HashMap<String, Integer>();
		ArrayList<String> l2 = new ArrayList<>();
		for (int i = 0; i < sarr1.length; i++) {
			if (!sarr1[i].equals(" ") && !sarr1[i].equals("")) {
				if (smap1.containsKey(sarr1[i])) {
					int j = smap1.get(sarr1[i]);
					smap1.put(sarr1[i], ++j);
				} else {
					smap1.put(sarr1[i], 1);
					// l1.add(sarr1[i]);
				}
			}
		}
		for (int i = 0; i < sarr2.length; i++) {
			if (!sarr2[i].equals(" ") && !sarr2[i].equals("")) {
				if (smap2.containsKey(sarr2[i])) {
					int j = smap2.get(sarr2[i]);
					smap2.put(sarr2[i], ++j);
				} else {
					smap2.put(sarr2[i], 1);
					// l2.add(sarr2[i]);
				}
			}
		}
		Map<String, Integer> sortMap = new TreeMap<String, Integer>();
		sortMap.putAll(smap1);
		Map<String, Integer> sortMap1 = new TreeMap<String, Integer>();
		sortMap1.putAll(smap2);
		// ArrayList<String> beans = new ArrayList<String>();
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(
				sortMap1.entrySet());

		// System.out.println(list);

		int wc = 0;

		Iterator itr = list.iterator();
		int h = 0;
		while (itr.hasNext() && h < list.size()) {
			l2.add(list.get(h).getKey());
			wc = wc + list.get(h).getValue();
			h++;
		}

		//System.out.println(wc);

		//System.out.println(l2);
		List<Map.Entry<String, Integer>> list1 = new ArrayList<Map.Entry<String, Integer>>(
				sortMap.entrySet());

		//System.out.println(list);

		Iterator itr1 = list1.iterator();
		int h1 = 0;
		while (itr1.hasNext() && h1 < list1.size()) {
			l1.add(list1.get(h1).getKey());
			h1++;
		}
		// System.out.println(l1);

		//System.out.println(l1);
		int count = 0;
		int count1 = 0;
		//System.out.println(l1.size());
		//System.out.println(l2.size());
		for (int q = 0; q < l1.size(); q++) {
			for (int w = count1; w < l2.size(); w++) {
				if (l1.get(q).equals(l2.get(w))
						|| l1.get(q).startsWith(l2.get(w))
						|| l2.get(w).startsWith(l1.get(q))) {
					//System.out.println("sdhgfdsh");
					int f = sortMap1.get(l2.get(w));
					count = count + f;
					count1++;
				}
			}
		}
		double coun = (100 * count) /(double) wc ;
		coun = Math.round(coun);
		//System.out.println((int)coun);
		int fi = (int)coun ;
		System.out.println(fi);
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(new File("output000.txt")));
			 
			bw.write(String.valueOf(fi));
			bw.close();
			//System.out.println("Dome");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		long t2 = System.currentTimeMillis();
		//System.out.println(t2);
		//System.out.println(((t2-t1))/6000);
	}
}
