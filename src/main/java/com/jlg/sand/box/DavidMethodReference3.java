package com.jlg.sand.box;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DavidMethodReference3 {

    //this is a better documentation..
    //https://www.geeksforgeeks.org/double-colon-operator-in-java/
    public static void main (String[] args){
        System.out.println("start DavidCodeTest");

//        ResponseEntity<Map<String, Object>> answerSessionResponse = getAnswerSession(input);
//        LinkedHashMap<String, Object> answerSession = (LinkedHashMap<String, Object>) answerSessionResponse.getBody();
//
//        LinkedHashMap<String, Object> psQuestionnaire =
//            (requestMap instanceof LinkedHashMap) ? (LinkedHashMap<String, Object>) requestMap : new LinkedHashMap<>();
//
//        Object dataObject = (psQuestionnaire.containsKey("data")) ? (psQuestionnaire.get("data")) : new Object();
//
//        Map<String, Object> data = (dataObject instanceof LinkedHashMap<?, ?> tempMap) ?
//
//            tempMap.entrySet().stream()
//
//                .filter(entry -> entry.getKey() instanceof String && entry.getValue() != null)
//
//                .collect(Collectors.toMap(entry -> (String) entry.getKey(),
//
//                    Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new))
//
//            : new LinkedHashMap<>();
//

        System.out.println("end DavidCodeTest");
    }

//    public ResponseEntity getAnswerSession(Map<String, Object> request) throws IOException {
//        ResponseEntity<?> response;
//        Map<String, String> inputMap = (Map<String, String>) request.get(INPUT);
//        String answerSessionId = "";
//
//        if (inputMap.containsKey(ANSWER_SESSION_ID)) {
//            answerSessionId = inputMap.get(ANSWER_SESSION_ID);
//        } else if (inputMap.containsKey(CUSTOMER_NO)) {
//            answerSessionId = eastoreageGetAnswerSessionId(inputMap.get(CUSTOMER_NO));
//        }
//
//        if (!answerSessionId.equals("")) {
//            Map<String, String> myRequest = new HashMap<>();
//            myRequest.put(ANSWER_SESSION_ID, answerSessionId);
//            try {
//                response = riskSelectionService.getAnswerSession(AGR, myRequest);
//                if (!(response.getBody() instanceof LinkedHashMap) || !response.getStatusCode().is2xxSuccessful()) {
//                    String errString = String.format(SEVERE_ERR_MSG, response.getBody());
//                    LOGGER.log(Level.SEVERE, errString);
//                    return errorMessageGenerator(GETERROR, 500);
//                }
//            } catch (HttpClientErrorException | HttpServerErrorException e) {
//                LOGGER.log(Level.SEVERE, String.format(SEVERE_ERR_MSG, e.getMessage()));
//                return errorMessageGenerator(GETERROR, 500);
//            }
//        } else {
//            return errorMessageGenerator("To start your UW Narrative, click the \"Create Answer Session\" button.", 404);
//        }
//
//        LinkedHashMap<String, Object> oldDataMap = (LinkedHashMap) response.getBody();
//
//        String releaseVer = response.getBody() instanceof Map<?,?> bodyMap ? getReleaseVersionFromResponse((Map<String,Object>) bodyMap) : "";
//
//        if (releaseVer.equals(CURRENT_SMARTS_RELEASE)
//            || releaseVer.equals("")) {
//            return addCasualtyPropertyDecorators(response);
//        } else {
//            return pullForwardToNewVersion(response, oldDataMap);
//        }
//
//    }
}
