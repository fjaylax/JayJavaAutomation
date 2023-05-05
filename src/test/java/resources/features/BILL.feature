Feature: Bill Automation Example

  @ui @upload
  Scenario: Verify successful file upload
    Given I am on the File Upload page
    When I select a valid file to upload
    And I click on the "Upload" button
    Then I should see a success message "File Was Successfully Uploaded!"


  @ui @tab
  Scenario Outline:Click The Buttons and Verify the Right Number of Cells and Values Appear
    Given I am on the Simple Table page
    And I select a <table_size> table
    When I click the "Fill Table" button
    Then the table should have <expected_cells> cells
    And the table should have <expected_values> values

    Examples:
      | table_size | expected_cells | expected_values |
      | 2        | 4              | 4               |
      | 3        | 9              | 9               |
      | 4        | 16             | 16              |
      | 5        | 25             | 25              |


  @ui @loader
  Scenario: Verify the Dynamic Loader loads content on the page
    Given the user is on the Dynamic Loader page
    When the user verifies that the dynamic loading progress bar is visible
    And the user verifies that the "Loading . . ." progress tab is displayed
    Then the user verifies that the "Complete!" tab is displayed after the content has loaded.

  @ui @download
  Scenario: Verify file download functionality
    Given I am on the File Download page
    And I verify correct "Download The File and Verify its Contents" is displayed
    When I click on the "Download" button for a file
    Then the file should start downloading
    And the download should complete successfully


  @ui @form
  Scenario Outline: Fill out complex form and verify success message and second page
    Given I am on the Complex Form page
    When I enter "<firstname>","<lastname>", "<email>", "<phone>", "<address>","<apt>" "<city>", "<state>", and other information
    And I click on the Next Step button
    Then I should see "SIZE & CRUST"on the second page
    And I select random toppings for my pizza
    When I click on the Next Step button
    And I should see and verify the "Special Instructions" header
    Then I leave "<instructions>" and click Submit

    Examples:
      | firstname | lastname | email             | phone        | address     | apt | city   | state   | instructions             |
      | John      | Doe      | john.doe@test.com | 785-456-7890 | 123 Main St | 305 | Tuscon | Arizona | Dont be late or no TIP!! |

 