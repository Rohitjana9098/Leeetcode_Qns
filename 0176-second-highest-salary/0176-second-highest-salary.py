import pandas as pd

def second_highest_salary(employee: pd.DataFrame) -> pd.DataFrame:
    # Get distinct salary values and sort them descending
    unique_salaries = employee['salary'].drop_duplicates().sort_values(ascending=False)
    
    # Check if there are at least 2 distinct salaries
    if len(unique_salaries) < 2:
        second_salary = None
    else:
        second_salary = unique_salaries.iloc[1]  # Index 1 corresponds to 2nd element
        
    return pd.DataFrame({'SecondHighestSalary': [second_salary]})