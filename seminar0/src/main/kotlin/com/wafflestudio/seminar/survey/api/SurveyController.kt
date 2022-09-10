package com.wafflestudio.seminar.survey.api

import com.wafflestudio.seminar.survey.domain.SurveyResponse
import com.wafflestudio.seminar.survey.service.SurveyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/surveys")
class SurveyController(
    
    private val surveyService: SurveyService
)
{
    @GetMapping("/")
    fun getAllResponses(): List<SurveyResponse> {
        return surveyService.getAllResponses()
    }
    
    @GetMapping("/{id}/")
    fun geyResponseById(@PathVariable("id") id:Long):SurveyResponse{
        return surveyService.getResponseById(id)
    }
    
    
}