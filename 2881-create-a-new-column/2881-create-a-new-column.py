import pandas as pd

def createBonusColumn(employees: pd.DataFrame) -> pd.DataFrame:
    # Multiply the salary column by 2 and assign it to a new 'bonus' column
    employees['bonus'] = employees['salary'] * 2
    return employees