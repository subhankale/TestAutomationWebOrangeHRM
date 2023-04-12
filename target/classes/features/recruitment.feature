Feature: Recruitment HRM
  Scenario: Admin add candidate
    Given User open browser and url
    When Admin click menu recruitment
    Then Admin go to page recruitment

    Scenario: Admin invalid add recruitment
      When Admin click button add
      And Enter middle name
      And Select vacancy
      And Click save
      Then Admin get to message required

      Scenario: Admin not enter expect format
        When Admin enter invalid email
        Then Admin get message expect format

        Scenario: Admin not input number
          When Admin enter string
          Then Admin get message allows number

          Scenario: Admin not input allowed file
            When Admin enter file image
            Then Admin get message not allow

            Scenario: Admin success add recruitment
              When Admin enter firstname
              And Enter middle name
              And Admin enter lastname
              And Admin enter email
              And Admin enter no telp
              And Admin enter file
              And Admin enter keywords
              And Admin enter date
              And Admin enter notes
              And Admin click icon
              And Click save
              Then Admin get result name