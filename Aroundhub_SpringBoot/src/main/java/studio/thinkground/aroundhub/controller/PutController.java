package studio.thinkground.aroundhub.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studio.thinkground.aroundhub.dto.MemberDTO;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {
	
	// putmapping은 데이터가 없을 경우 insert와 동일하게 동작
	// 데이터가 있을 경우 수정
	@PutMapping(value ="/default")
	public String putMethod() {
		return "hello world";
	}
	
	@PutMapping(value = "/member")
	public String postMember(@RequestBody Map<String, Object> postData) {
		StringBuffer sb = new StringBuffer();
		postData.entrySet().forEach(map -> {
			sb.append(map.getKey() + " : " + map.getValue() + "\n");
		});
		return sb.toString();
	} 
	
	@PutMapping(value = "/member1")
	public String postMemberDto1(@RequestBody MemberDTO memberDTO) {
		return memberDTO.toString();
	}
	
	@PutMapping(value = "/member2")
	public MemberDTO posMemberDTO2(@RequestBody MemberDTO memberDTO) {
		return memberDTO;
	}
	
	@PutMapping(value = "/member3")
	public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
