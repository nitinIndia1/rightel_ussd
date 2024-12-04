package com.wpits.rightel.service;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class NextService {

	
	public Map<String,Map<String,String>> getNextService(String msisdn,String strNext,String input,Map<String,Map<String,String>> map){
		
		switch (strNext) {
		case "languageSelectInput": {
			
			map =  languageServiceInput(msisdn, input, map);
			break;
		}
		case "welcomeToRightelInput": {
			map = welcomeToRightelInput(msisdn,input,map);
			break;
		}
		case "welcomeToAzanInput": {
			map = welcomeToAzanInput(msisdn,input,map);
			break;
		}
		case "sessionTerminateAzan": {
			map.remove(msisdn);
			break;
		}
		case "crbtInput" : {
			map = crbtInput(msisdn,input,map);
			break;	
		}
		case "hotRbtInput" :{
			map = hotRbtInput(msisdn,input,map);
			break;
		}
		case "recommendInput" :{
			map = recommendInput(msisdn,input,map);
			break;
		}
		case "monthlyInput" :{
			map = monthlyInput(msisdn,input,map);
			break;
		}
		case "weeklyInput" :{
			map = weeklyInput(msisdn,input,map);
			break;
		}
		case "moreCrbtInput" :{
			map = moreCrbtInput(msisdn,input,map);
			break;
		}
		case "confirmSongSelectInput" :{
			map = confirmSongSelectInput(msisdn,input,map);
			break;
		}
		case "sessionTerminateCrbt" :{
			map.remove(msisdn);
			break;
		}
		case "popCtgInput1" :{
			String ctg = "pop";
			map = popCtgInput1(msisdn,input,map,ctg);
			break;
		}
		case "traditionalCtgInput1" :{
			String ctg = "traditional";
			map = traditionalCtgInput1(msisdn,input,map,ctg);
			break;
		}
		case "religiousCtgInput1" :{
			String ctg = "religious";
			map = religiousCtgInput1(msisdn,input,map,ctg);
			break;
		}
		case "footballCtgInput1" :{
			String ctg = "football";
			map = footballCtgInput1(msisdn,input,map,ctg);
			break;
		}
		
		
		
		
		
		case "popNewReleasesInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","NewReleases",num);
			break;
		}
		case "popNewReleasesInput2" :{
			String num = "2";
			map =  newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","NewReleases",num);
			break;
		}
		
		case "popTopSongsInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","TopSongs",num);
			break;
		}
		case "popTopSongsInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","TopSongs",num);
			break;
		}
		
		case "popMonthlyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","Monthly",num);
			break;
		}
		case "popMonthlyRankInput2" :{
			
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","Monthly",num);
			break;
		}
		
		case "popWeeklyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","Weekly",num);
			break;
		}
		case "popWeeklyRankInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"pop","Weekly",num);
			break;
		}


		case "traditionalNewReleasesInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","NewReleases",num);
			break;
		}
		case "traditionalNewReleasesInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","NewReleases",num);
			break;
		}
		
		case "traditionalTopSongsInput1" :{
			
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","TopSongs",num);
			break;
		}
		case "traditionalTopSongsInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","TopSongs",num);
			break;
		}
		
		case "traditionalMonthlyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","Monthly",num);
			break;
		}
		case "traditionalMonthlyRankInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","Monthly",num);
			break;
		}
		
		case "traditionalWeeklyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","Weekly",num);
			break;
		}
		case "traditionalWeeklyRankInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"traditional","Weekly",num);
			break;
		}
		
		
		case "religiousNewReleasesInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","NewReleases",num);
			break;
		}
		case "religiousNewReleasesInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","NewReleases",num);
			break;
		}
		
		case "religiousTopSongsInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","TopSongs",num);
			break;
		}
		case "religiousTopSongsInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","TopSongs",num);
			break;
		}
		
		case "religiousMonthlyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","Monthly",num);
			break;
		}
		case "religiousMonthlyRankInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","Monthly",num);
			break;
		}
		
		case "religiousWeeklyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","Weekly",num);
			break;
		}
		case "religiousWeeklyRankInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"religious","Weekly",num);
			break;
		}
		

		case "footballNewReleasesInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","NewReleases",num);
			break;
		}
		case "footballNewReleasesInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","NewReleases",num);
			break;
		}
		
		case "footballTopSongsInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","TopSongs",num);
			break;
		}
		case "footballTopSongsInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","TopSongs",num);
			break;
		}
		
		case "footballMonthlyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","Monthly",num);
			break;
		}
		case "footballMonthlyRankInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","Monthly",num);
			break;
		}
		
		case "footballWeeklyRankInput1" :{
			String num = "1";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","Weekly",num);
			break;
		}
		case "footballWeeklyRankInput2" :{
			String num = "2";
			map = newReleasesTopSongsMonthlyWeeklyInput(msisdn,input,map,"football","Weekly",num);
			break;
		}
		
		case "manageActInput" : {
			map = manageActInput(msisdn,input,map);
			break;
		}
		case "sessionTerminateCurrentActiveSong" : {
			map.remove(msisdn);
			break;
		}
		case "firstConfirmUnSubscribeInput" : {
			map = firstConfirmUnSubscribeInput(msisdn,input,map);
			break;
		}
		case "finalConfirmUnSubscribeInput" : {
			map = finalConfirmUnSubscribeInput(msisdn,input,map);
			break;
		}
		case "sessionTerminateUnsubscription" : {
			map.remove(msisdn);
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + strNext);
		}
		return map;
	}
	
		private Map<String, Map<String, String>> finalConfirmUnSubscribeInput(
			String msisdn, String input, Map<String, Map<String, String>> map) {
			
			switch (input) {
				case "1" : {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "thankYouUnsubscriptionDisp");
					subMap.put("next", "sessionTerminateUnsubscription");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "2" : {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "manageActDisp");
					subMap.put("next", "manageActInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				default :
					throw new IllegalArgumentException(
							"Unexpected value: " + input);
			}
		return map;
	}

		private Map<String, Map<String, String>> firstConfirmUnSubscribeInput(
			String msisdn, String input, Map<String, Map<String, String>> map) {
			switch (input) {
				case "1" : {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "finalConfirmUnSubscribeDisp");
					subMap.put("next", "finalConfirmUnSubscribeInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "2" : {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "manageActDisp");
					subMap.put("next", "manageActInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				default :
					throw new IllegalArgumentException(
							"Unexpected value: " + input);
			}
		return map;
	}

		private Map<String, Map<String, String>> manageActInput(String msisdn,
			String input, Map<String, Map<String, String>> map) {

			switch (input) {
				case "1" : {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "currentActiveSongDisp");
					subMap.put("next", "sessionTerminateCurrentActiveSong");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					
					break;
				}
				case "2" : {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "firstConfirmUnSubscribeDisp");
					subMap.put("next", "firstConfirmUnSubscribeInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
						
					
					break;
				}
				case "3" : {
						
					
					break;
				}
				
				
				
				default :
					throw new IllegalArgumentException(
							"Unexpected value: " + input);
			}
			
		return map;
	}

		private Map<String, Map<String, String>> newReleasesTopSongsMonthlyWeeklyInput(String msisdn,
			String input, Map<String, Map<String, String>> map, String ctg,String subCtg,String num) {
			

			if(num.equalsIgnoreCase("1")) {
				switch (input) {
					case "1": {
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						subMap.put("previous", ctg+"~"+subCtg+"~List1~Song1");
						map.put(msisdn, subMap);
						break;
					}
					case "2": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						subMap.put("previous", ctg+"~"+subCtg+"~List1~Song2");
						map.put(msisdn, subMap);
						break;
					}
					case "3": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						
						subMap.put("previous", ctg+"~"+subCtg+"~List1~Song3");
						map.put(msisdn, subMap);
						break;
					}
					case "4": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						subMap.put("previous", ctg+"~"+subCtg+"~List1~Song4");
						map.put(msisdn, subMap);
						break;
					}
					case "5": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						
						subMap.put("previous", ctg+"~"+subCtg+"~List1~Song5");
						map.put(msisdn, subMap);
						break;
					}
					case "6": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", ctg+""+subCtg+"Disp2");
						subMap.put("next", ctg+""+subCtg+"Input2");

						subMap.put("previous", null);
						map.put(msisdn, subMap);
						break;
					}
					case "7": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", ctg+"CtgDisp");
						subMap.put("next", ctg+"CtgInput"+num);

						subMap.put("previous", null);
						map.put(msisdn, subMap);
						break;
					}
										
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + input);
					}
			}
			else if(num.equalsIgnoreCase("2")) {
				switch (input) {
					case "1": {
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						subMap.put("previous", ctg+"~"+subCtg+"~List2~Song1");
						map.put(msisdn, subMap);
						break;
					}
					case "2": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						subMap.put("previous", ctg+"~"+subCtg+"~List2~Song2");
						map.put(msisdn, subMap);
						break;
					}
					case "3": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						
						subMap.put("previous", ctg+"~"+subCtg+"~List2~Song3");
						map.put(msisdn, subMap);
						break;
					}
					case "4": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						subMap.put("previous", ctg+"~"+subCtg+"~List2~Song4");
						map.put(msisdn, subMap);
						break;
					}
					case "5": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", "confirmSongSelectDisp");
						subMap.put("next", "confirmSongSelectInput");
						
						subMap.put("previous", ctg+"~"+subCtg+"~List2~Song5");
						map.put(msisdn, subMap);
						break;
					}
					case "6": {
						
						Map<String,String> subMap = map.get(msisdn);
						subMap.put("cur", ctg+""+subCtg+"Disp1");
						subMap.put("next", ctg+""+subCtg+"Input1");

						subMap.put("previous", null);
						map.put(msisdn, subMap);
						break;
					}
										
					
					default:
						throw new IllegalArgumentException("Unexpected value: " + input);
					}
			}
			

				return map;
		

	}


		private Map<String, Map<String, String>> footballCtgInput1(String msisdn,
			String input, Map<String, Map<String, String>> map,String ctg) {
			return newReleaseTopSongsEtc(msisdn, input, map, ctg,"1");
	}

		private Map<String, Map<String, String>> religiousCtgInput1(String msisdn,
			String input, Map<String, Map<String, String>> map,String ctg) {
			return newReleaseTopSongsEtc(msisdn, input, map, ctg,"1");
	}

		private Map<String, Map<String, String>> traditionalCtgInput1(String msisdn,
			String input, Map<String, Map<String, String>> map,String ctg) {
			return newReleaseTopSongsEtc(msisdn, input, map, ctg,"1");
	}

		private Map<String, Map<String, String>> popCtgInput1(String msisdn,
			String input, Map<String, Map<String, String>> map,String ctg) {
			return newReleaseTopSongsEtc(msisdn, input, map, ctg,"1");
	}

		private Map<String, Map<String, String>> newReleaseTopSongsEtc(
				String msisdn, String input,
				Map<String, Map<String, String>> map, String ctg,String num) {
			switch (input) {
				case "1": {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", ctg+"NewReleasesDisp"+num);
					subMap.put("next", ctg+"NewReleasesInput"+num);
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "2": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", ctg+"TopSongsDisp"+num);
					subMap.put("next", ctg+"TopSongsInput"+num);
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "3": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", ctg+"MonthlyRankDisp"+num);
					subMap.put("next", ctg+"MonthlyRankInput"+num);
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "4": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", ctg+"WeeklyRankDisp"+num);
					subMap.put("next", ctg+"WeeklyRankInput"+num);
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "5": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "moreCrbtDisp");
					subMap.put("next", "moreCrbtInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				
		
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
				return map;
		}

		private Map<String, Map<String, String>> confirmSongSelectInput(
			String msisdn, String input, Map<String, Map<String, String>> map) {
			switch (input) {
			case "1": {
				Map<String,String> subMap = map.get(msisdn);
				subMap.put("cur", "thankYouTuneSetDisp");
				subMap.put("next", "sessionTerminateCrbt");
				//subMap.put("previous", null);
				map.put(msisdn, subMap);
				break;
			}
			case "*": {
	
				Map<String,String> subMap = map.get(msisdn);
				subMap.put("cur", "crbtDisp");
				subMap.put("next", "crbtInput");
				subMap.put("previous", null);
				map.put(msisdn, subMap);
				break;
			}
	
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
			return map;

	}

		private Map<String, Map<String, String>> moreCrbtInput(String msisdn,
			String input, Map<String, Map<String, String>> map) {
			switch (input) {
				case "1": {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "popCtgDisp");
					subMap.put("next", "popCtgInput1");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "2": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "traditionalCtgDisp");
					subMap.put("next", "traditionalCtgInput1");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "3": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "religiousCtgDisp");
					subMap.put("next", "religiousCtgInput1");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "4": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "footballCtgDisp");
					subMap.put("next", "footballCtgInput1");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "5": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "manageActDisp");
					subMap.put("next", "manageActInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "6": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "crbtDisp");
					subMap.put("next", "crbtInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
		
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
				return map;
	}

		private Map<String, Map<String, String>> weeklyInput(String msisdn,
			String input, Map<String, Map<String, String>> map) {
			return crbt_first_song_select_confirm("weekly",msisdn, input, map);
	}

		private Map<String, Map<String, String>> monthlyInput(String msisdn,
			String input, Map<String, Map<String, String>> map) {
			return crbt_first_song_select_confirm("monthly",msisdn, input, map);
	}

		private Map<String, Map<String, String>> recommendInput(String msisdn,
			String input, Map<String, Map<String, String>> map) {
			return crbt_first_song_select_confirm("recommend",msisdn, input, map);
	}

		private Map<String, Map<String, String>> hotRbtInput(String msisdn,
			String input, Map<String, Map<String, String>> map) {
			return crbt_first_song_select_confirm("hotRbt",msisdn, input, map);
	}

		private Map<String, Map<String, String>> crbt_first_song_select_confirm(
				String firstWelcomeCtg,String msisdn, String input,
				Map<String, Map<String, String>> map) {
			switch (input) {
				case "1": {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "confirmSongSelectDisp");
					subMap.put("next", "confirmSongSelectInput");
					subMap.put("previous", firstWelcomeCtg+"~1");
					map.put(msisdn, subMap);
					break;
				}
				case "2": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "confirmSongSelectDisp");
					subMap.put("next", "confirmSongSelectInput");
					subMap.put("previous", firstWelcomeCtg+"~2");
					map.put(msisdn, subMap);
					break;
				}
				case "3": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "confirmSongSelectDisp");
					subMap.put("next", "confirmSongSelectInput");
					subMap.put("previous", firstWelcomeCtg+"~3");
					map.put(msisdn, subMap);
					break;
				}
				case "4": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "confirmSongSelectDisp");
					subMap.put("next", "confirmSongSelectInput");
					subMap.put("previous", firstWelcomeCtg+"~4");
					map.put(msisdn, subMap);
					break;
				}
				case "5": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "confirmSongSelectDisp");
					subMap.put("next", "confirmSongSelectInput");
					subMap.put("previous", firstWelcomeCtg+"~5");
					map.put(msisdn, subMap);
					break;
				}
				case "6": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "crbtDisp");
					subMap.put("next", "crbtInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
		
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
				return map;
		}

		private Map<String, Map<String, String>> crbtInput(String msisdn,
			String input, Map<String, Map<String, String>> map) {
			
			switch (input) {
				case "1": {
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "hotRbtDisp");
					subMap.put("next", "hotRbtInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "2": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "recommendDisp");
					subMap.put("next", "recommendInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "3": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "monthlyDisp");
					subMap.put("next", "monthlyInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "4": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "weeklyDisp");
					subMap.put("next", "weeklyInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
				case "5": {
					
					Map<String,String> subMap = map.get(msisdn);
					subMap.put("cur", "moreCrbtDisp");
					subMap.put("next", "moreCrbtInput");
					subMap.put("previous", null);
					map.put(msisdn, subMap);
					break;
				}
		
				default:
					throw new IllegalArgumentException("Unexpected value: " + input);
				}
				return map;
	}

		private Map<String, Map<String, String>> welcomeToAzanInput(String msisdn, String input,Map<String, Map<String, String>> map) {
	
			switch (input) {
			case "1": {
				Map<String,String> subMap = map.get(msisdn);
				subMap.put("cur", "thankYouAzanDisp");
				subMap.put("next", "sessionTerminateAzan");
				subMap.put("previous", null);
				map.put(msisdn, subMap);
				break;
			}
			case "2": {
	
				Map<String,String> subMap = map.get(msisdn);
				subMap.put("cur", "thankYouAzanDisp");
				subMap.put("next", "sessionTerminateAzan");
				subMap.put("previous", null);
				map.put(msisdn, subMap);
				break;
			}
	
			default:
				throw new IllegalArgumentException("Unexpected value: " + input);
			}
			return map;
		}	
	private Map<String, Map<String, String>> welcomeToRightelInput(String msisdn, String input,
			Map<String, Map<String, String>> map) {
		
		switch (input) {
		case "1": {
			Map<String,String> subMap = map.get(msisdn);
			subMap.put("cur", "welcomeToAzanDisp");
			subMap.put("next", "welcomeToAzanInput");
			subMap.put("previous", null);
			map.put(msisdn, subMap);
			break;
		}
		case "2": {

			Map<String,String> subMap = map.get(msisdn);
			subMap.put("cur", "crbtDisp");
			subMap.put("next", "crbtInput");
			subMap.put("previous", null);
			map.put(msisdn, subMap);
			break;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
		return map;
	}


	private Map<String,Map<String,String>> languageServiceInput(String msisdn,String input,Map<String,Map<String,String>> map) {
		switch (input) {
		case "1": {
			break;
		
		}
		case "2":{
			Map<String,String> subMap = map.get(msisdn);
			subMap.put("cur", "welcomeToRightelDisp");
			subMap.put("next", "welcomeToRightelInput");
			subMap.put("previous", null);
			map.put(msisdn, subMap);
			break;
			
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	return map;
	}
}
