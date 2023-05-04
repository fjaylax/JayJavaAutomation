Feature: Bill Automation Example
  @ui @upload
  Scenario: Verify successful file upload
    Given I am on the File Upload page
    When I select a valid file to upload
    And I click on the "Upload" button
    Then I should see a success message "File uploaded successfully"
    And the file should be displayed on the page
