package com.wpits.rightel.service;




import java.util.Map;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class CurrentService {

	private final SongService songService;
	
	public String[] getCurrent(String strCur,String msisdn,Map<String,Map<String,String>> map) {
		String[] arr = new String[2];
		
		switch (strCur) {
		case "languageSelectDisp": {
			arr=getLanguageDisp(arr);
			break;
		}
		case "welcomeToRightelDisp": {
			arr = welcomeToRightelDisp(arr);
			break;
		}
		case "welcomeToAzanDisp": {
			arr = welcomeToAzanDisp(arr);
			break;
		}
		case "crbtDisp" : {
			arr = crbtDisp(arr);
			break;
		}
		case "thankYouAzanDisp" : {
			arr = thankYouAzanDisp(arr);
			break;
		}
		case "hotRbtDisp" : {
			arr = hotRbtDisp(arr);
			break;
		}
		case "recommendDisp" : {
			arr = recommendDisp(arr);
			break;
		}
		case "monthlyDisp" : {
			arr = monthlyDisp(arr);
			break;
		}
		case "weeklyDisp" : {
			arr = weeklyDisp(arr);
			break;
		}
		case "moreCrbtDisp" : {
			arr = moreCrbtDisp(arr);
			break;
		}
		case "confirmSongSelectDisp" : {
			arr = confirmSongSelectDisp(arr);
			break;
		}
		case "thankYouTuneSetDisp" : {
			arr = thankYouTuneSetDisp(arr,msisdn,map);
			break;
		}
		case "popCtgDisp" : {
			arr = popCtgDisp(arr);
			break;
		}
		case "traditionalCtgDisp" : {
			arr = traditionalCtgDisp(arr);
			break;
		}
		case "religiousCtgDisp" : {
			arr = religiousCtgDisp(arr);
			break;
		}
		case "footballCtgDisp" : {
			arr = footballCtgDisp(arr);
			break;
		}
		case "manageActDisp" : {
			arr = manageActDisp(arr);
			break;
		}
		case "popNewReleasesDisp1" : {
			arr = songService.popNewReleasesDisp1(arr);
			break;
		}
		case "popTopSongsDisp1" : {
			arr = songService.popTopSongsDisp1(arr);
			break;
		}
		case "popMonthlyRankDisp1" : {
			arr = songService.popMonthlyRankDisp1(arr);
			break;
		}
		case "popWeeklyRankDisp1" : {
			arr = songService.popWeeklyRankDisp1(arr);
			break;
		}
		
		case "traditionalNewReleasesDisp1" : {
			arr = songService.traditionalNewReleasesDisp1(arr);
			break;
		}
		case "traditionalTopSongsDisp1" : {
			arr = songService.traditionalTopSongsDisp1(arr);
			break;
		}
		case "traditionalMonthlyRankDisp1" : {
			arr = songService.traditionalMonthlyRankDisp1(arr);
			break;
		}
		case "traditionalWeeklyRankDisp1" : {
			arr = songService.traditionalWeeklyRankDisp1(arr);
			break;
		}
		case "religiousNewReleasesDisp1" : {
			arr = songService.religiousNewReleasesDisp1(arr);
			break;
		}
		case "religiousTopSongsDisp1" : {
			arr = songService.religiousTopSongsDisp1(arr);
			break;
		}
		case "religiousMonthlyRankDisp1" : {
			arr = songService.religiousMonthlyRankDisp1(arr);
			break;
		}
		case "religiousWeeklyRankDisp1" : {
			arr = songService.religiousWeeklyRankDisp1(arr);
			break;
		}
		case "footballNewReleasesDisp1" : {
			arr = songService.footballNewReleasesDisp1(arr);
			break;
		}
		case "footballTopSongsDisp1" : {
			arr = songService.footballTopSongsDisp1(arr);
			break;
		}
		case "footballMonthlyRankDisp1" : {
			arr = songService.footballMonthlyRankDisp1(arr);
			break;
		}
		case "footballWeeklyRankDisp1" : {
			arr = songService.footballWeeklyRankDisp1(arr);
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		case "popNewReleasesDisp2" : {
			arr = songService.popNewReleasesDisp2(arr);
			break;
		}
		case "popTopSongsDisp2" : {
			arr = songService.popTopSongsDisp2(arr);
			break;
		}
		case "popMonthlyRankDisp2" : {
			arr = songService.popMonthlyRankDisp2(arr);
			break;
		}
		case "popWeeklyRankDisp2" : {
			arr = songService.popWeeklyRankDisp2(arr);
			break;
		}
		
		case "traditionalNewReleasesDisp2" : {
			arr = songService.traditionalNewReleasesDisp2(arr);
			break;
		}
		case "traditionalTopSongsDisp2" : {
			arr = songService.traditionalTopSongsDisp2(arr);
			break;
		}
		case "traditionalMonthlyRankDisp2" : {
			arr = songService.traditionalMonthlyRankDisp2(arr);
			break;
		}
		case "traditionalWeeklyRankDisp2" : {
			arr = songService.traditionalWeeklyRankDisp2(arr);
			break;
		}
		case "religiousNewReleasesDisp2" : {
			arr = songService.religiousNewReleasesDisp2(arr);
			break;
		}
		case "religiousTopSongsDisp2" : {
			arr = songService.religiousTopSongsDisp2(arr);
			break;
		}
		case "religiousMonthlyRankDisp2" : {
			arr = songService.religiousMonthlyRankDisp2(arr);
			break;
		}
		case "religiousWeeklyRankDisp2" : {
			arr = songService.religiousWeeklyRankDisp2(arr);
			break;
		}
		case "footballNewReleasesDisp2" : {
			arr = songService.footballNewReleasesDisp2(arr);
			break;
		}
		case "footballTopSongsDisp2" : {
			arr = songService.footballTopSongsDisp2(arr);
			break;
		}
		case "footballMonthlyRankDisp2" : {
			arr = songService.footballMonthlyRankDisp2(arr);
			break;
		}
		case "footballWeeklyRankDisp2" : {
			arr = songService.footballWeeklyRankDisp2(arr);
			break;
		}
		case "popNewReleasesList1Song1Disp":{
			arr = confirmSongSelectDisp(arr);
			break;
		}
		
		
		case "currentActiveSongDisp" : {
			arr = currentActiveSongDisp(arr,msisdn,map);
			break;
		}
		case "firstConfirmUnSubscribeDisp" : {
			arr = firstConfirmUnSubscribeDisp(arr);
			break;
		}
		case "finalConfirmUnSubscribeDisp" : {
			arr = finalConfirmUnSubscribeDisp(arr,msisdn);
			break;
		}
		case "thankYouUnsubscriptionDisp" : {
			arr = thankYouUnsubscriptionDisp(arr,msisdn);
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + strCur);
		}
		
		
		return arr;
	}
	
		
	
	private String[] thankYouUnsubscriptionDisp(String[] arr, String msisdn) {
		
		String text = "Thank you ! You have unsubscribed from the service. If you want to subscriber again then Dial *210#";
		String action = "3";
		arr[0]=text;
		arr[1]=action;
		songService.unsubscrition(msisdn);
		return arr;
	}



	private String[] finalConfirmUnSubscribeDisp(String[] arr,String msisdn) {
		String text = "You have still ["+songService.getActiveDaysLeft(msisdn)+"] days left in service. Still you want to deactivate\r\n"
				+ "1. YES\r\n"
				+ "2. Back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}



	private String[] firstConfirmUnSubscribeDisp(String[] arr) {
		String text = "You want to unsubscribe ?\r\n"
				+ "1. Yes \r\n"
				+ "2. back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}



	private String[] currentActiveSongDisp(String[] arr, String msisdn,
			Map<String, Map<String, String>> map) {
		String text = "You have below song active as your caller tune : \""+songService.getActiveSong(msisdn)+"\"";
		String action = "3";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}



	private String[] manageActDisp(String[] arr) {
		String text = "1. Current Active song \r\n"
				+ "2. Unsubscribe\r\n"
				+ "3. Back\r\n"
				+ "";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] footballCtgDisp(String[] arr) {
		return subCtgDisp(arr);
	}
	private String[] religiousCtgDisp(String[] arr) {
		return subCtgDisp(arr);
	}
	private String[] traditionalCtgDisp(String[] arr) {
		return subCtgDisp(arr);
	}
	private String[] popCtgDisp(String[] arr) {
		return subCtgDisp(arr);
	}
	
	private String[] subCtgDisp(String[] arr) {
		String text = "1. New Releases\r\n"
				+ "2. Top songs\r\n"
				+ "3. Monthly Rank\r\n"
				+ "4. Weekly Rank \r\n"
				+ "5. back\r\n"
				+ "";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] thankYouTuneSetDisp(String[] arr,String msisdn, Map<String,Map<String,String>> map) {
		Map<String,String> subMap = map.get(msisdn);
		String text =null;	
		String previous = subMap.get("previous");
		if(previous!=null) {
			text = "Thank you The tune will be set and you will receive the confirmation on SMS. Tune selected is : "+previous;

		}
		else {
			text = "Thank you The tune will be set and you will receive the confirmation on SMS.";
		}
		String action = "3";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] confirmSongSelectDisp(String[] arr) {
		String text = "You will be charged --IRR for this tune. Please press 1 to confirm. * Back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] moreCrbtDisp(String[] arr) {
		String text = "1. POP\r\n"
				+ "2. Traditional\r\n"
				+ "3. Religious \r\n"
				+ "4. Football Song\r\n"
				+ "5. Manage account\r\n"
				+ "6. Back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] weeklyDisp(String[] arr) {
		String text = "1. song1\r\n"
				+ "2. song2\r\n"
				+ "3. song3\r\n"
				+ "4. song4\r\n"
				+ "5. song5\r\n"
				+ "6. back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] monthlyDisp(String[] arr) {
		String text = "1. song1\r\n"
				+ "2. song2\r\n"
				+ "3. song3\r\n"
				+ "4. song4\r\n"
				+ "5. song5\r\n"
				+ "6. back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] recommendDisp(String[] arr) {
		String text = "1. song1\r\n"
				+ "2. song2\r\n"
				+ "3. song3\r\n"
				+ "4. song4\r\n"
				+ "5. song5\r\n"
				+ "6. back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] hotRbtDisp(String[] arr) {
		String text = "1. song1\r\n"
				+ "2. song2\r\n"
				+ "3. song3\r\n"
				+ "4. song4\r\n"
				+ "5. song5\r\n"
				+ "6. back";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] thankYouAzanDisp(String[] arr) {
		String text = "\r\n"
				+ "Thank you . Azan will be set and you will receive the confirmation on SMS.\r\n"
				+ "";
		String action = "3";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] crbtDisp(String[] arr) {
		String text = "Welcome to  Rightel Caller tune Please select what you wish to do?\r\n"
				+ "1.	Hot RBT\r\n"
				+ "2.	Recommend\r\n"
				+ "3.	Monthly Ranking \r\n"
				+ "4.	Weekly Ranking\r\n"
				+ "5.	More\r\n"
				+ "";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
	private String[] welcomeToAzanDisp(String[] arr) {
		String text = "Welcome to Rightel Azaan tune. Now choose your favorite  Azaan from below.\r\n"
				+ "Charges ----IRR/month for Subscription and -----IRR/mth for Azaan tune.\r\n"
				+ "\r\n"
				+ "1.Azaan by –----\r\n"
				+ " 2.Azaan by -----\r\n"
				+ "3. More\r\n"
				+ "";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}

	private String[] welcomeToRightelDisp(String[] arr) {
		String text = "Welcome to Rightel Caller tune Please select what you wish to do?\r\n"
				+ "1.	Azan service\r\n"
				+ "2.	caller tune service\r\n"
				+ "";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}

	private String[] getLanguageDisp(String[] arr) {
		String text = "Please select the below language\r\n"
				+ "1.	Farsi\r\n"
				+ "2.	Englsih";
		String action = "2";
		arr[0]=text;
		arr[1]=action;
		return arr;
	}
}
