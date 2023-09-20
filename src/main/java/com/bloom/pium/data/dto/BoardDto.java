package com.bloom.pium.data.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class BoardDto {
    private String title;
    private String content;
    private  String schedule;
    private  String place;

//    private int likeCnt;
//    private int viewCnt;
    // ↓↓ 추가 (2023.09.17.일)
    private Long categoryId;
    private Long userInfoId;

}

//ProductDto: 클라이언트에서 서버