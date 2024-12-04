package com.wpits.rightel.service;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Predicate;
import java.util.stream.*;

import org.springframework.stereotype.Service;

@Service
public class SongService {

	
	
	
	
	
	public void unsubscrition(String msisdn) {
		//unsubscribe process.
	}

	public String getActiveDaysLeft(String msisdn) {
		int days = ThreadLocalRandom.current().ints( 1 , 7 ).limit(1).findFirst().getAsInt();
		return ""+days;
	}
	
	public String getActiveSong(String msisdn) {
		return "dummy song";
	}
	
	
	
	public String[] footballWeeklyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("footballWeeklyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] footballMonthlyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("footballMonthlyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] footballTopSongsDisp1(String[] arr) {
		String text =  makeSongListFromCtg("footballTopSongsList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] footballNewReleasesDisp1(String[] arr) {
		String text =  makeSongListFromCtg("footballNewReleaseList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousWeeklyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("religiousWeeklyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousMonthlyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("religiousMonthlyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousTopSongsDisp1(String[] arr) {
		String text =  makeSongListFromCtg("religiousTopSongsList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousNewReleasesDisp1(String[] arr) {
		String text =  makeSongListFromCtg("religiousNewReleaseList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalWeeklyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("traditionalWeeklyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalMonthlyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("traditionalMonthlyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalTopSongsDisp1(String[] arr) {
		String text =  makeSongListFromCtg("traditionalTopSongsList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalNewReleasesDisp1(String[] arr) {
		String text =  makeSongListFromCtg("traditionalNewReleaseList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popWeeklyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("popWeeklyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popMonthlyRankDisp1(String[] arr) {
		String text =  makeSongListFromCtg("popMonthlyRankList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popTopSongsDisp1(String[] arr) {
		String text =  makeSongListFromCtg("popTopSongsList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popNewReleasesDisp1(String[] arr) {
		String text =  makeSongListFromCtg("popNewReleaseList1");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}

	

	
	
	
	
	
	public String[] footballWeeklyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("footballWeeklyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] footballMonthlyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("footballMonthlyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] footballTopSongsDisp2(String[] arr) {
		String text =  makeSongListFromCtg("footballTopSongsList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] footballNewReleasesDisp2(String[] arr) {
		String text =  makeSongListFromCtg("footballNewReleaseList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousWeeklyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("religiousWeeklyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousMonthlyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("religiousMonthlyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousTopSongsDisp2(String[] arr) {
		String text =  makeSongListFromCtg("religiousTopSongsList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] religiousNewReleasesDisp2(String[] arr) {
		String text =  makeSongListFromCtg("religiousNewReleaseList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalWeeklyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("traditionalWeeklyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalMonthlyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("traditionalMonthlyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalTopSongsDisp2(String[] arr) {
		String text =  makeSongListFromCtg("traditionalTopSongsList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] traditionalNewReleasesDisp2(String[] arr) {
		String text =  makeSongListFromCtg("traditionalNewReleaseList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popWeeklyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("popWeeklyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popMonthlyRankDisp2(String[] arr) {
		String text =  makeSongListFromCtg("popMonthlyRankList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popTopSongsDisp2(String[] arr) {
		String text =  makeSongListFromCtg("popTopSongsList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	public String[] popNewReleasesDisp2(String[] arr) {
		String text =  makeSongListFromCtg("popNewReleaseList2");
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String makeSongListFromCtg(String ctg) {
		
		String str = "";
		switch (ctg) {
			case "popNewReleaseList1" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_new_release_list1_song1");
				list.add("pop_new_release_list1_song2");
				list.add("pop_new_release_list1_song3");
				list.add("pop_new_release_list1_song4");
				list.add("pop_new_release_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "popNewReleaseList2" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_new_release_list2_song1");
				list.add("pop_new_release_list2_song2");
				list.add("pop_new_release_list2_song3");
				list.add("pop_new_release_list2_song4");
				list.add("pop_new_release_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "popTopSongsList1" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_top_songs_list1_song1");
				list.add("pop_top_songs_list1_song2");
				list.add("pop_top_songs_list1_song3");
				list.add("pop_top_songs_list1_song4");
				list.add("pop_top_songs_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "popTopSongsList2" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_top_songs_list2_song1");
				list.add("pop_top_songs_list2_song2");
				list.add("pop_top_songs_list2_song3");
				list.add("pop_top_songs_list2_song4");
				list.add("pop_top_songs_list2_song5");
				
				str = listToString(list,"B");
				

				break;
			}
			
			case "popMonthlyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_monthly_rank_list1_song1");
				list.add("pop_monthly_rank_list1_song2");
				list.add("pop_monthly_rank_list1_song3");
				list.add("pop_monthly_rank_list1_song4");
				list.add("pop_monthly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;

			}
			
			case "popMonthlyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_monthly_rank_list2_song1");
				list.add("pop_monthly_rank_list2_song2");
				list.add("pop_monthly_rank_list2_song3");
				list.add("pop_monthly_rank_list2_song4");
				list.add("pop_monthly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "popWeeklyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_weekly_rank_list1_song1");
				list.add("pop_weekly_rank_list1_song2");
				list.add("pop_weekly_rank_list1_song3");
				list.add("pop_weekly_rank_list1_song4");
				list.add("pop_weekly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "popWeeklyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("pop_weekly_rank_list2_song1");
				list.add("pop_weekly_rank_list2_song2");
				list.add("pop_weekly_rank_list2_song3");
				list.add("pop_weekly_rank_list2_song4");
				list.add("pop_weekly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			case "traditionalNewReleaseList1" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_new_release_list1_song1");
				list.add("traditional_new_release_list1_song2");
				list.add("traditional_new_release_list1_song3");
				list.add("traditional_new_release_list1_song4");
				list.add("traditional_new_release_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "traditionalNewReleaseList2" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_new_release_list2_song1");
				list.add("traditional_new_release_list2_song2");
				list.add("traditional_new_release_list2_song3");
				list.add("traditional_new_release_list2_song4");
				list.add("traditional_new_release_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "traditionalTopSongsList1" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_top_songs_list1_song1");
				list.add("traditional_top_songs_list1_song2");
				list.add("traditional_top_songs_list1_song3");
				list.add("traditional_top_songs_list1_song4");
				list.add("traditional_top_songs_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "traditionalTopSongsList2" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_top_songs_list2_song1");
				list.add("traditional_top_songs_list2_song2");
				list.add("traditional_top_songs_list2_song3");
				list.add("traditional_top_songs_list2_song4");
				list.add("traditional_top_songs_list2_song5");
				
				str = listToString(list,"B");
				

				break;
			}
			
			case "traditionalMonthlyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_monthly_rank_list1_song1");
				list.add("traditional_monthly_rank_list1_song2");
				list.add("traditional_monthly_rank_list1_song3");
				list.add("traditional_monthly_rank_list1_song4");
				list.add("traditional_monthly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;

			}
			
			case "traditionalMonthlyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_monthly_rank_list2_song1");
				list.add("traditional_monthly_rank_list2_song2");
				list.add("traditional_monthly_rank_list2_song3");
				list.add("traditional_monthly_rank_list2_song4");
				list.add("traditional_monthly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "traditionalWeeklyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_weekly_rank_list1_song1");
				list.add("traditional_weekly_rank_list1_song2");
				list.add("traditional_weekly_rank_list1_song3");
				list.add("traditional_weekly_rank_list1_song4");
				list.add("traditional_weekly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "traditionalWeeklyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("traditional_weekly_rank_list2_song1");
				list.add("traditional_weekly_rank_list2_song2");
				list.add("traditional_weekly_rank_list2_song3");
				list.add("traditional_weekly_rank_list2_song4");
				list.add("traditional_weekly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			case "religiousNewReleaseList1" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_new_release_list1_song1");
				list.add("religious_new_release_list1_song2");
				list.add("religious_new_release_list1_song3");
				list.add("religious_new_release_list1_song4");
				list.add("religious_new_release_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "religiousNewReleaseList2" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_new_release_list2_song1");
				list.add("religious_new_release_list2_song2");
				list.add("religious_new_release_list2_song3");
				list.add("religious_new_release_list2_song4");
				list.add("religious_new_release_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "religiousTopSongsList1" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_top_songs_list1_song1");
				list.add("religious_top_songs_list1_song2");
				list.add("religious_top_songs_list1_song3");
				list.add("religious_top_songs_list1_song4");
				list.add("religious_top_songs_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "religiousTopSongsList2" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_top_songs_list2_song1");
				list.add("religious_top_songs_list2_song2");
				list.add("religious_top_songs_list2_song3");
				list.add("religious_top_songs_list2_song4");
				list.add("religious_top_songs_list2_song5");
				
				str = listToString(list,"B");
				

				break;
			}
			
			case "religiousMonthlyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_monthly_rank_list1_song1");
				list.add("religious_monthly_rank_list1_song2");
				list.add("religious_monthly_rank_list1_song3");
				list.add("religious_monthly_rank_list1_song4");
				list.add("religious_monthly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;

			}
			
			case "religiousMonthlyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_monthly_rank_list2_song1");
				list.add("religious_monthly_rank_list2_song2");
				list.add("religious_monthly_rank_list2_song3");
				list.add("religious_monthly_rank_list2_song4");
				list.add("religious_monthly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "religiousWeeklyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_weekly_rank_list1_song1");
				list.add("religious_weekly_rank_list1_song2");
				list.add("religious_weekly_rank_list1_song3");
				list.add("religious_weekly_rank_list1_song4");
				list.add("religious_weekly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "religiousWeeklyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("religious_weekly_rank_list2_song1");
				list.add("religious_weekly_rank_list2_song2");
				list.add("religious_weekly_rank_list2_song3");
				list.add("religious_weekly_rank_list2_song4");
				list.add("religious_weekly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			case "footballNewReleaseList1" : {
				List<String> list = new ArrayList<String>();
				list.add("football_new_release_list1_song1");
				list.add("football_new_release_list1_song2");
				list.add("football_new_release_list1_song3");
				list.add("football_new_release_list1_song4");
				list.add("football_new_release_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "footballNewReleaseList2" : {
				List<String> list = new ArrayList<String>();
				list.add("football_new_release_list2_song1");
				list.add("football_new_release_list2_song2");
				list.add("football_new_release_list2_song3");
				list.add("football_new_release_list2_song4");
				list.add("football_new_release_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "footballTopSongsList1" : {
				List<String> list = new ArrayList<String>();
				list.add("football_top_songs_list1_song1");
				list.add("football_top_songs_list1_song2");
				list.add("football_top_songs_list1_song3");
				list.add("football_top_songs_list1_song4");
				list.add("football_top_songs_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "footballTopSongsList2" : {
				List<String> list = new ArrayList<String>();
				list.add("football_top_songs_list2_song1");
				list.add("football_top_songs_list2_song2");
				list.add("football_top_songs_list2_song3");
				list.add("football_top_songs_list2_song4");
				list.add("football_top_songs_list2_song5");
				
				str = listToString(list,"B");
				

				break;
			}
			
			case "footballMonthlyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("football_monthly_rank_list1_song1");
				list.add("football_monthly_rank_list1_song2");
				list.add("football_monthly_rank_list1_song3");
				list.add("football_monthly_rank_list1_song4");
				list.add("football_monthly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;

			}
			
			case "footballMonthlyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("football_monthly_rank_list2_song1");
				list.add("football_monthly_rank_list2_song2");
				list.add("football_monthly_rank_list2_song3");
				list.add("football_monthly_rank_list2_song4");
				list.add("football_monthly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			case "footballWeeklyRankList1" : {
				List<String> list = new ArrayList<String>();
				list.add("football_weekly_rank_list1_song1");
				list.add("football_weekly_rank_list1_song2");
				list.add("football_weekly_rank_list1_song3");
				list.add("football_weekly_rank_list1_song4");
				list.add("football_weekly_rank_list1_song5");
				
				str = listToString(list,"A");
				
				break;
			}
			
			case "footballWeeklyRankList2" : {
				List<String> list = new ArrayList<String>();
				list.add("football_weekly_rank_list2_song1");
				list.add("football_weekly_rank_list2_song2");
				list.add("football_weekly_rank_list2_song3");
				list.add("football_weekly_rank_list2_song4");
				list.add("football_weekly_rank_list2_song5");
				
				str = listToString(list,"B");
				
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			default :
				throw new IllegalArgumentException("Unexpected value: " + ctg);
		}
		return str;
	}
	
	
	
	
	private String listToString(List<String> list,String value) {
		String str =  IntStream.range(0, list.size())
	            .mapToObj(i-> i+1 + ". " + list.get(i)+" \r\n")
	            .collect(Collectors.joining());
		
		
		if(value.equalsIgnoreCase("A")) {
			str = str+"6. More \r\n"
					+ "7. Back \r\n"
					+ "0. Main Menu \r\n";
		}
		else {
			str = str+"6. Back \r\n"
					+ "0. Main Menu \r\n";
		}
		return str;
	}
}
