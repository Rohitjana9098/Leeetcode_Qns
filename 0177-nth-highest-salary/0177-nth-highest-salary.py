import pandas as pd

def nth_highest_salary(employee: pd.DataFrame, N: int) -> pd.DataFrame:
    # Handle invalid or non-positive N
    if N <= 0:
        return pd.DataFrame({f'getNthHighestSalary({N})': [None]})
    
    # Extract unique salaries and sort them in descending order
    unique_salaries = employee['salary'].drop_duplicates().sort_values(ascending=False)
    
    # Check if we have at least N unique salaries
    if len(unique_salaries) < N:
        nth_salary = None
    else:
        # Use .iloc[N - 1] since Pandas uses 0-based indexing
        nth_salary = unique_salaries.iloc[N - 1]
        
    # Return result formatted as a DataFrame
    return pd.DataFrame({f'getNthHighestSalary({N})': [nth_salary]})