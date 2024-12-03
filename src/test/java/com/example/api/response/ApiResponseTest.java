package com.example.api.response;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import static org.assertj.core.api.Assertions.assertThat;

class ApiResponseTest {

    @Test
    void testOkResponseWithData() {
        // Given
        String testData = "Test Data";

        // When
        ApiResponse<String> response = ApiResponse.ok(testData);

        // Then
        assertThat(response.success()).isTrue();
        assertThat(response.payload()).isEqualTo(testData);
        assertThat(response.error()).isNull();
        assertThat(response.httpStatus()).isEqualTo(HttpStatus.OK);
    }

    @Test
    void testOkResponseWithNullData() {
        // When
        ApiResponse<String> response = ApiResponse.ok(null);

        // Then
        assertThat(response.success()).isTrue();
        assertThat(response.payload()).isNull();
        assertThat(response.error()).isNull();
        assertThat(response.httpStatus()).isEqualTo(HttpStatus.OK);
    }
}

